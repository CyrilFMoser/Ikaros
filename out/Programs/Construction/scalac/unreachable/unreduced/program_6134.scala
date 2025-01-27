package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Byte) extends T_A
case class CC_B(a: Char, b: (T_A,T_B[T_A]), c: CC_A) extends T_A
case class CC_C(a: T_B[Int], b: CC_B) extends T_A
case class CC_D(a: Int, b: CC_B) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, CC_A(_, _)), _) => 0 
  case CC_A(CC_C(_, _), _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_, CC_B(_, _, CC_A(_, _))) => 3 
}
}
// This is not matched: CC_A(CC_A(_, _), _)