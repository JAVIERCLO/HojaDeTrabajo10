import networkx as ntx
import matplotlib.pyplot as plt


G = ntx.petersen_graph()
subax1 = plt.pyplot(121)
ntx.draw(G, with_labels=True, font_weight='bold')
subax2 = plt.pyplot(122)
ntx.draw_shell(G, nlist=[range(5, 10), range(5)], with_labels=True, font_weight='bold')