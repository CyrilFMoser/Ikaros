package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,T_A[Byte])) extends T_A[T_A[Byte]]
case class CC_B(a: Int, b: Byte, c: ((CC_A,CC_A),(CC_A,CC_A))) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, ((_,_),(_,_))) => 1 
}
}