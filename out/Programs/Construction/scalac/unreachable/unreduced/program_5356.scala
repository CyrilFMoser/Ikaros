package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B(a: T_A[Char], b: T_A[T_A[(Char,Int)]]) extends T_A[Char]
case class CC_C() extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(CC_C(), _) => 3 
  case CC_C() => 4 
}
}