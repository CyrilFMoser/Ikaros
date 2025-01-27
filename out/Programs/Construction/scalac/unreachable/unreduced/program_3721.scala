package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Int, T_A[T_A[Boolean, Int], T_A[Int, Boolean]]]
case class CC_B(a: CC_A, b: T_A[CC_A, T_A[Int, CC_A]], c: CC_A) extends T_A[Int, T_A[T_A[Boolean, Int], T_A[Int, Boolean]]]

val v_a: T_A[Int, T_A[T_A[Boolean, Int], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, CC_A()) => 1 
}
}