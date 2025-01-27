package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int, b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_B(a: T_A[Boolean], b: (T_B[Char],T_B[Char]), c: T_A[T_A[Byte]]) extends T_B[Char]
case class CC_C(a: T_B[Char], b: CC_B, c: T_B[CC_A[Boolean]]) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), (CC_B(_, _, _),CC_B(_, _, _)), _) => 0 
  case CC_B(CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), (CC_C(_, _, _),CC_B(_, _, _)), _) => 1 
  case CC_B(CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), (CC_C(_, _, _),CC_C(_, _, _)), _) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_B(CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), (CC_B(_, _, _),CC_C(_, _, _)), _)