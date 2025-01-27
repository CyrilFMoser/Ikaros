package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: D) extends T_A[D]
case class CC_B[E](a: T_A[E], b: E, c: E) extends T_B[E, Byte]
case class CC_C(a: CC_A[Char], b: T_B[T_A[Byte], Byte], c: Int) extends T_B[T_B[CC_B[(Boolean,Char)], CC_A[Int]], Byte]
case class CC_D[F](a: CC_C, b: (CC_B[CC_C],T_B[CC_C, CC_C]), c: F) extends T_B[F, Byte]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), _) => 0 
  case CC_C(_, CC_D(CC_C(_, _, _), (_,_), _), _) => 1 
}
}