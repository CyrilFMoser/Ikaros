package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char, b: T_B[D]) extends T_A[D, (T_B[(Boolean,Byte)],T_B[Int])]
case class CC_B[E](a: CC_A[E], b: (T_A[Int, Char],T_A[Byte, Byte])) extends T_A[E, (T_B[(Boolean,Byte)],T_B[Int])]
case class CC_C[F](a: T_B[F], b: ((Char,Boolean),Int)) extends T_B[F]
case class CC_D(a: CC_B[T_B[Boolean]], b: CC_A[T_B[Byte]], c: Int) extends T_B[Byte]

val v_a: T_A[Byte, (T_B[(Boolean,Byte)],T_B[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _)) => 0 
  case CC_A(_, CC_D(_, _, _)) => 1 
  case CC_B(CC_A(_, _), (_,_)) => 2 
}
}