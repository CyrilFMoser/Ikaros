package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_B[Char, (T_A,CC_A)], c: CC_A) extends T_A
case class CC_C(a: T_B[T_A, CC_B], b: T_A) extends T_A
case class CC_D[C](a: T_A, b: Byte) extends T_B[Int, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, CC_A()) => 1 
  case CC_C(_, CC_A()) => 2 
  case CC_C(_, CC_C(_, _)) => 3 
}
}
// This is not matched: CC_C(_, CC_B(CC_A(), _, _))