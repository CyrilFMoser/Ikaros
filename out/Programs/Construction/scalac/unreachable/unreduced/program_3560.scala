package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: D) extends T_A[D, T_B[(Byte,Byte)]]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, T_A[CC_A[Char], CC_A[Boolean]]]
case class CC_C[F](a: T_A[CC_A[Int], F], b: T_B[F]) extends T_B[F]
case class CC_D(a: CC_B[(Int,Boolean)], b: CC_B[T_A[Int, Char]]) extends T_B[T_A[CC_C[Byte], T_A[Byte, Boolean]]]
case class CC_E(a: (CC_C[Int],T_A[CC_D, CC_D])) extends T_B[T_A[CC_C[Byte], T_A[Byte, Boolean]]]

val v_a: T_B[T_A[CC_C[Byte], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, CC_C(_, _))) => 0 
  case CC_C(_, CC_C(_, CC_D(_, _))) => 1 
  case CC_C(_, CC_C(_, CC_E(_))) => 2 
  case CC_C(_, CC_D(CC_B(_), CC_B(_))) => 3 
  case CC_C(_, CC_E((_,_))) => 4 
  case CC_D(_, _) => 5 
  case CC_E((CC_C(_, _),_)) => 6 
}
}