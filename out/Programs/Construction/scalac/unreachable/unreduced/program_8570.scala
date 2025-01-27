package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Char], b: (T_A[Int],Char)) extends T_A[Char]
case class CC_B(a: (T_A[(Int,Char)],CC_A)) extends T_B
case class CC_C(a: CC_A, b: T_A[Char]) extends T_B
case class CC_D(a: T_A[Char], b: T_A[Char]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A(_, _))) => 0 
  case CC_C(_, CC_A(_, _)) => 1 
}
}
// This is not matched: CC_D(CC_A(_, (_,_)), CC_A(CC_A(_, _), (_,_)))