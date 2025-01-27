package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[Char, C], c: Char) extends T_A[Char, C]
case class CC_B() extends T_A[Char, Int]
case class CC_C() extends T_A[Char, Int]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_A(_, CC_C(), _) => 2 
  case CC_B() => 3 
  case CC_C() => 4 
}
}