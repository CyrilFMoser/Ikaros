package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A], b: T_B[Int]) extends T_A
case class CC_C(a: CC_B, b: T_A, c: (T_A,Byte)) extends T_A
case class CC_D(a: T_A, b: CC_C, c: CC_B) extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(CC_B(_, _), _, _)