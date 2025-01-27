package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_A) extends T_B[Int, C]

val v_a: CC_C[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
}
}
// This is not matched: CC_D(_, CC_A(CC_B(_, _, _), (_,_), CC_A(_, _, _)), _)