package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Int]
case class CC_B(a: CC_A, b: T_A[Int], c: CC_A) extends T_A[Int]
case class CC_C(a: T_A[Char], b: CC_A) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), CC_A()) => 1 
  case CC_B(_, CC_B(CC_A(), CC_A(), _), CC_A()) => 2 
  case CC_B(_, CC_B(CC_A(), CC_B(_, _, _), _), CC_A()) => 3 
  case CC_B(_, CC_B(CC_A(), CC_C(_, _), _), CC_A()) => 4 
  case CC_B(_, CC_C(_, CC_A()), CC_A()) => 5 
  case CC_C(_, CC_A()) => 6 
}
}