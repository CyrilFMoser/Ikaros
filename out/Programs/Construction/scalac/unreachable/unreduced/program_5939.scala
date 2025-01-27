package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Int]) extends T_A[Int]
case class CC_B(a: T_A[Int], b: (T_A[Int],T_A[T_B])) extends T_A[Int]
case class CC_C() extends T_B
case class CC_D(a: Int, b: T_A[Int], c: CC_A) extends T_B
case class CC_E(a: T_B, b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_A(CC_A(_)), _) => 1 
  case CC_D(_, CC_A(CC_B(_, _)), _) => 2 
  case CC_D(_, CC_B(_, (_,_)), _) => 3 
  case CC_E(CC_C(), _) => 4 
  case CC_E(CC_D(_, _, _), _) => 5 
  case CC_E(CC_E(CC_D(_, _, _), CC_B(_, _)), _) => 6 
  case CC_E(CC_E(CC_E(_, _), CC_B(_, _)), _) => 7 
}
}
// This is not matched: CC_E(CC_E(CC_C(), CC_B(_, _)), _)