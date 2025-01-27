package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: (CC_A,T_A[(Int,Int)]), b: T_A[T_A[Boolean]], c: CC_A) extends T_A[Boolean]
case class CC_C(a: CC_A) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
  case CC_C(CC_A()) => 1 
}
}
// This is not matched: CC_A()