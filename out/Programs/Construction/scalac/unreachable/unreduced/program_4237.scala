package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean, b: T_A[D, D], c: T_B[D]) extends T_A[T_A[T_B[Char], T_A[Int, (Boolean,Boolean)]], D]
case class CC_B[E](a: E) extends T_B[E]
case class CC_C(a: Byte, b: T_A[T_B[Boolean], T_A[Char, Byte]], c: T_A[T_B[Boolean], CC_B[(Boolean,Byte)]]) extends T_B[T_B[T_B[Char]]]
case class CC_D(a: CC_B[((Byte,Boolean),CC_C)], b: T_B[Boolean], c: T_B[T_A[CC_C, CC_C]]) extends T_B[T_B[T_B[Char]]]

val v_a: T_B[T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(CC_B((_,_)), CC_B(true), _) => 2 
  case CC_D(CC_B((_,_)), CC_B(false), _) => 3 
}
}