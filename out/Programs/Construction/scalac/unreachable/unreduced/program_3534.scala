package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[Byte], b: T_A[Int], c: Boolean) extends T_A[Int]
case class CC_C(a: CC_A) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_B(_, CC_B(_, CC_A(), _), _) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 3 
  case CC_B(_, CC_B(_, CC_C(_), _), _) => 4 
  case CC_B(_, CC_C(_), _) => 5 
  case CC_C(_) => 6 
}
}