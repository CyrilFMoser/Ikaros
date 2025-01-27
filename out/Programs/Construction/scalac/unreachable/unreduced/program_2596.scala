package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Byte]], b: ((Boolean,Int),T_B[Boolean, Char]), c: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B[D](a: Int) extends T_B[D, T_A[T_A[Byte]]]
case class CC_C[E](a: T_A[T_A[Byte]], b: CC_A, c: CC_A) extends T_B[T_A[CC_B[Byte]], T_A[T_A[Byte]]]
case class CC_D[F](a: Char) extends T_B[F, T_A[T_A[Byte]]]

val v_a: T_B[T_A[CC_B[Byte]], T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(CC_A(_, _, _), _, _), CC_A(_, (_,_), _), _) => 2 
}
}
// This is not matched: CC_D(_)