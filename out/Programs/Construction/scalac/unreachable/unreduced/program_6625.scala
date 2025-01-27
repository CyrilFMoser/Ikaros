package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Boolean,(Int,(Char,Boolean))), b: T_A[T_A[Char]]) extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_C(a: CC_B) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A((_,_), _)) => 0 
  case CC_B(CC_B(CC_A(_, _))) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
  case CC_B(CC_B(CC_C(_))) => 3 
  case CC_B(CC_C(CC_B(_))) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_A(_, _)