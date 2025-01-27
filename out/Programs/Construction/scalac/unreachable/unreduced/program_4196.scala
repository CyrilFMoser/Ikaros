package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D]) extends T_A[D]
case class CC_B(a: (T_A[Char],T_B[Int, Boolean]), b: T_A[(Int,Byte)]) extends T_A[T_A[T_B[(Byte,Boolean), Boolean]]]
case class CC_C[E](a: Boolean, b: Int) extends T_A[E]
case class CC_D[F](a: T_B[T_A[Byte], F], b: CC_C[F], c: CC_A[F]) extends T_B[T_A[Byte], F]
case class CC_E[G]() extends T_B[T_A[Byte], G]

val v_a: T_A[T_A[T_B[(Byte,Boolean), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), _)) => 0 
  case CC_A(CC_A(CC_B(_, _), _), CC_A(CC_A(_, _), _)) => 1 
  case CC_A(CC_A(CC_C(_, _), _), CC_A(CC_A(_, _), _)) => 2 
  case CC_A(CC_B(_, CC_A(_, _)), CC_A(CC_A(_, _), _)) => 3 
  case CC_A(CC_B(_, CC_C(_, _)), CC_A(CC_A(_, _), _)) => 4 
  case CC_A(CC_C(_, 12), CC_A(CC_A(_, _), _)) => 5 
  case CC_A(CC_C(_, _), CC_A(CC_A(_, _), _)) => 6 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_B(_, _), _)) => 7 
  case CC_A(CC_A(CC_B(_, _), _), CC_A(CC_B(_, _), _)) => 8 
  case CC_A(CC_A(CC_C(_, _), _), CC_A(CC_B(_, _), _)) => 9 
  case CC_A(CC_B(_, CC_A(_, _)), CC_A(CC_B(_, _), _)) => 10 
  case CC_A(CC_B(_, CC_C(_, _)), CC_A(CC_B(_, _), _)) => 11 
  case CC_A(CC_C(_, 12), CC_A(CC_B(_, _), _)) => 12 
  case CC_A(CC_C(_, _), CC_A(CC_B(_, _), _)) => 13 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_C(_, _), _)) => 14 
  case CC_A(CC_A(CC_B(_, _), _), CC_A(CC_C(_, _), _)) => 15 
  case CC_A(CC_A(CC_C(_, _), _), CC_A(CC_C(_, _), _)) => 16 
  case CC_A(CC_B(_, CC_A(_, _)), CC_A(CC_C(_, _), _)) => 17 
  case CC_A(CC_B(_, CC_C(_, _)), CC_A(CC_C(_, _), _)) => 18 
  case CC_A(CC_C(_, 12), CC_A(CC_C(_, _), _)) => 19 
  case CC_A(CC_C(_, _), CC_A(CC_C(_, _), _)) => 20 
  case CC_A(CC_A(CC_A(_, _), _), CC_B(_, _)) => 21 
  case CC_A(CC_A(CC_B(_, _), _), CC_B(_, _)) => 22 
  case CC_A(CC_A(CC_C(_, _), _), CC_B(_, _)) => 23 
  case CC_A(CC_B(_, CC_A(_, _)), CC_B(_, _)) => 24 
  case CC_A(CC_B(_, CC_C(_, _)), CC_B(_, _)) => 25 
  case CC_A(CC_C(_, 12), CC_B(_, _)) => 26 
  case CC_A(CC_C(_, _), CC_B(_, _)) => 27 
  case CC_A(CC_A(CC_A(_, _), _), CC_C(_, 12)) => 28 
  case CC_A(CC_A(CC_B(_, _), _), CC_C(_, 12)) => 29 
  case CC_A(CC_A(CC_C(_, _), _), CC_C(_, 12)) => 30 
  case CC_A(CC_B(_, CC_A(_, _)), CC_C(_, 12)) => 31 
  case CC_A(CC_B(_, CC_C(_, _)), CC_C(_, 12)) => 32 
  case CC_A(CC_C(_, 12), CC_C(_, 12)) => 33 
  case CC_A(CC_C(_, _), CC_C(_, 12)) => 34 
  case CC_A(CC_A(CC_A(_, _), _), CC_C(_, _)) => 35 
  case CC_A(CC_A(CC_B(_, _), _), CC_C(_, _)) => 36 
  case CC_A(CC_A(CC_C(_, _), _), CC_C(_, _)) => 37 
  case CC_A(CC_B(_, CC_A(_, _)), CC_C(_, _)) => 38 
  case CC_A(CC_B(_, CC_C(_, _)), CC_C(_, _)) => 39 
  case CC_A(CC_C(_, 12), CC_C(_, _)) => 40 
  case CC_A(CC_C(_, _), CC_C(_, _)) => 41 
  case CC_B((CC_A(_, _),_), CC_A(_, CC_A(_, _))) => 42 
  case CC_B((CC_C(_, _),_), CC_A(_, CC_A(_, _))) => 43 
  case CC_B((CC_A(_, _),_), CC_A(_, CC_C(_, _))) => 44 
  case CC_B((CC_C(_, _),_), CC_A(_, CC_C(_, _))) => 45 
  case CC_B((CC_A(_, _),_), CC_C(_, _)) => 46 
  case CC_B((CC_C(_, _),_), CC_C(_, _)) => 47 
  case CC_C(_, 12) => 48 
  case CC_C(_, _) => 49 
}
}