package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[(Boolean,Boolean)]], b: Boolean, c: ((Byte,Int),T_A[Boolean])) extends T_A[T_B[T_A[Int]]]
case class CC_B() extends T_A[T_B[T_A[Int]]]
case class CC_C(a: CC_B) extends T_A[T_B[T_A[Int]]]

val v_a: T_A[T_B[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, ((_,_),_)) => 0 
  case CC_B() => 1 
  case CC_C(CC_B()) => 2 
}
}