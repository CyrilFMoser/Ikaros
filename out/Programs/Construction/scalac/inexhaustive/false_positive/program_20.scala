package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Int]
case class CC_B() extends T_A[Int]
case class CC_C(a: CC_B, b: (T_A[CC_B],T_B), c: T_B) extends T_B
case class CC_D(a: T_A[CC_A], b: Int, c: CC_C) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_C(_, _, CC_D(_, _, _))) => 0 
}
}
// This is not matched: CC_B(_, _, CC_A(_, _))