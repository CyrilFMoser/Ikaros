package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: E, c: Char) extends T_A[E, T_B[Boolean, E]]
case class CC_B[F](a: T_A[F, T_B[Boolean, F]]) extends T_A[F, T_B[Boolean, F]]
case class CC_C(a: T_A[CC_A[(Int,Char)], Int], b: Boolean) extends T_A[T_B[T_B[Int, Int], CC_A[Boolean]], T_B[Boolean, T_B[T_B[Int, Int], CC_A[Boolean]]]]
case class CC_D(a: (CC_B[CC_C],Char), b: CC_B[T_B[Byte, CC_C]], c: (Int,Char)) extends T_B[CC_B[T_B[CC_C, CC_C]], T_A[CC_A[CC_C], T_B[Boolean, CC_A[CC_C]]]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((CC_B(_),_), CC_B(CC_A(_, _, _)), (_,_)) => 0 
  case CC_D((CC_B(_),_), CC_B(CC_B(_)), (_,_)) => 1 
}
}