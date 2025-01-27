package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: T_B[D]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: Int, b: Byte, c: (T_A[Byte, (Int,Int)],T_B[Char])) extends T_A[E, T_A[E, E]]
case class CC_C(a: Byte, b: T_B[T_B[(Boolean,Int)]]) extends T_B[(CC_A[Byte],Char)]
case class CC_D(a: T_A[CC_A[CC_C], Char]) extends T_B[(CC_A[Byte],Char)]
case class CC_E(a: CC_A[T_B[CC_C]], b: Char) extends T_B[(CC_A[Byte],Char)]

val v_a: T_B[(CC_A[Byte],Char)] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_D(_)