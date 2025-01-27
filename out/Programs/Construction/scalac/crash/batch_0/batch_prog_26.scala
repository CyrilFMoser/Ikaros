package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: (T_A[Char],(Int,Char))) extends T_B[T_B[T_A[Boolean]]]
case class CC_C(a: Boolean) extends T_B[T_B[T_A[Boolean]]]

val v_a: T_B[T_B[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(),(_,_))) => 0 
  case CC_C(true) => 1 
  case CC_C(false) => 2 
}
}