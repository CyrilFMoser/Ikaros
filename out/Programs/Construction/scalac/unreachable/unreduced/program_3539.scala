package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Boolean],T_A[Boolean]), b: T_B[T_A[Char], T_B[Byte, Char]]) extends T_A[Boolean]
case class CC_B(a: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_C(a: T_B[T_A[Boolean], CC_A]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),CC_A(_, _)), _) => 0 
  case CC_A((CC_A(_, _),CC_B(_)), _) => 1 
  case CC_A((CC_A(_, _),CC_C(_)), _) => 2 
  case CC_A((CC_B(_),CC_A(_, _)), _) => 3 
  case CC_A((CC_B(_),CC_B(_)), _) => 4 
  case CC_A((CC_B(_),CC_C(_)), _) => 5 
  case CC_A((CC_C(_),CC_B(_)), _) => 6 
  case CC_A((CC_C(_),CC_C(_)), _) => 7 
  case CC_B(_) => 8 
  case CC_C(_) => 9 
}
}
// This is not matched: CC_A((CC_C(_),CC_A(_, _)), _)