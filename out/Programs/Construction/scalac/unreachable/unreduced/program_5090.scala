package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Boolean, T_A[Boolean, T_A[Char, Char]]]
case class CC_B(a: (CC_A,T_A[CC_A, Boolean])) extends T_A[Boolean, T_A[Boolean, T_A[Char, Char]]]

val v_a: T_A[Boolean, T_A[Boolean, T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_)) => 1 
}
}