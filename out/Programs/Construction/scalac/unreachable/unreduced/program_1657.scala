package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D(a: T_A, b: T_B[(Char,Int)], c: CC_C) extends T_B[(Char,Int)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_)) => 0 
  case CC_A(_, CC_C(_)) => 1 
  case CC_B(_) => 2 
  case CC_C(CC_B(_)) => 3 
}
}
// This is not matched: CC_A(_, CC_A(_, _))