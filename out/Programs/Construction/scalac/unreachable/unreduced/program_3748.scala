package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B(a: Char, b: T_A[CC_A]) extends T_A[Char]
case class CC_C(a: CC_B, b: T_A[Char], c: CC_B) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_B(_, _), CC_A(), CC_B(_, _)) => 2 
  case CC_C(CC_B(_, _), CC_B(_, _), CC_B(_, _)) => 3 
  case CC_C(CC_B(_, _), CC_C(CC_B(_, _), CC_A(), CC_B(_, _)), CC_B(_, _)) => 4 
  case CC_C(CC_B(_, _), CC_C(CC_B(_, _), CC_B(_, _), CC_B(_, _)), CC_B(_, _)) => 5 
  case CC_C(CC_B(_, _), CC_C(CC_B(_, _), CC_C(_, _, _), CC_B(_, _)), CC_B(_, _)) => 6 
}
}