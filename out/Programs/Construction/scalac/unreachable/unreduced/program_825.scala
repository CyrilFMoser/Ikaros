package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Char]
case class CC_B(a: T_A[T_A[Char]]) extends T_A[Char]
case class CC_C(a: CC_A, b: T_A[Char]) extends T_A[Char]
case class CC_D(a: Byte, b: T_A[Char], c: CC_C) extends T_B
case class CC_E() extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_A(), CC_A()) => 1 
  case CC_C(CC_A(), CC_B(_)) => 2 
  case CC_C(CC_A(), CC_C(_, _)) => 3 
}
}
// This is not matched: CC_B(_)