import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

compilers = ['javac', 'scalac', 'ghc',]
methods = ['Z3']

d = dict()
stat = 'solver_time'

for c in compilers:
    for m in methods:
        df = pd.read_csv(f'out/Programs/{m}/{c}/more_stats.csv')[:1000]
        df = df[df[stat] <= 450000]
        d[f"{c} using {m}"] = df[stat]/1000
        mean = df[stat].mean()/1000
        print(f"{c} with {m}: {mean} ")
        print("--------")

df = pd.DataFrame(data=d)
print(df)

fig, ax = plt.subplots()


df = df.melt()
df = df[df['value'] < 2000]
df = df.rename(columns={"variable": "Configuration"})
sns.histplot(df, x='value', hue='Configuration', multiple='dodge', bins=20)


plt.xlabel("Number of Patterns")
plt.ylabel('Frequency')

plt.show()
