package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B() extends T_A[Char]
case class CC_C(a: T_A[Char], b: T_A[T_A[Char]]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(CC_A(), _) => 2 
  case CC_C(CC_B(), _) => 3 
  case CC_C(CC_C(_, _), _) => 4 
}
}