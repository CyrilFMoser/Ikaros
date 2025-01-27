package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int, b: (Char,Byte), c: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[T_A[T_B]], b: T_A[T_B], c: T_A[CC_A]) extends T_B
case class CC_C(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, (_,_), _), _) => 0 
  case CC_C(CC_B(_, CC_A(_, _, _), _)) => 1 
  case CC_C(CC_C(CC_C(_))) => 2 
}
}
// This is not matched: CC_C(CC_C(CC_B(_, _, _)))