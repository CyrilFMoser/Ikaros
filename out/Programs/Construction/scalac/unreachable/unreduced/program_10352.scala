package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Char],T_A[Char]), b: T_B[T_A[Boolean], T_A[Char]]) extends T_A[Boolean]
case class CC_B[D, E](a: CC_A) extends T_B[D, E]
case class CC_C(a: T_B[((Int,Byte),CC_A), CC_A], b: (T_A[Char],Char)) extends T_B[T_A[Boolean], CC_A]
case class CC_D() extends T_B[T_A[Boolean], CC_A]

val v_a: T_B[T_A[Boolean], CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_C(_, (_,_)) => 1 
  case CC_D() => 2 
}
}