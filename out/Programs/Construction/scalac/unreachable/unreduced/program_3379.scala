package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: T_B[D]) extends T_A[D, T_A[T_A[Int, Int], T_B[Int]]]
case class CC_B(a: CC_A[T_B[(Boolean,Byte)]], b: CC_A[T_B[Byte]]) extends T_A[T_A[T_A[(Byte,Int), Int], T_A[Char, Int]], T_A[T_A[Int, Int], T_B[Int]]]
case class CC_C(a: (CC_B,CC_B), b: CC_A[T_A[CC_B, CC_B]], c: (Byte,T_A[(Boolean,Byte), CC_B])) extends T_A[T_A[T_A[(Byte,Int), Int], T_A[Char, Int]], T_A[T_A[Int, Int], T_B[Int]]]
case class CC_D[E]() extends T_B[E]
case class CC_E[F](a: T_B[(CC_B,CC_B)], b: F) extends T_B[F]
case class CC_F[G](a: T_B[G], b: T_B[G], c: CC_A[G]) extends T_B[G]

val v_a: T_B[T_A[T_A[T_A[(Byte,Int), Int], T_A[Char, Int]], T_A[T_A[Int, Int], T_B[Int]]]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _) => 1 
  case CC_F(_, CC_D(), CC_A(_, _, CC_D())) => 2 
  case CC_F(_, CC_E(CC_D(), _), CC_A(_, _, CC_D())) => 3 
  case CC_F(_, CC_E(CC_E(_, _), _), CC_A(_, _, CC_D())) => 4 
  case CC_F(_, CC_E(CC_F(_, _, _), _), CC_A(_, _, CC_D())) => 5 
  case CC_F(_, CC_F(CC_D(), CC_D(), CC_A(_, _, _)), CC_A(_, _, CC_D())) => 6 
  case CC_F(_, CC_F(CC_E(_, _), CC_D(), CC_A(_, _, _)), CC_A(_, _, CC_D())) => 7 
  case CC_F(_, CC_F(CC_F(_, _, _), CC_D(), CC_A(_, _, _)), CC_A(_, _, CC_D())) => 8 
  case CC_F(_, CC_F(CC_D(), CC_E(_, _), CC_A(_, _, _)), CC_A(_, _, CC_D())) => 9 
  case CC_F(_, CC_F(CC_E(_, _), CC_E(_, _), CC_A(_, _, _)), CC_A(_, _, CC_D())) => 10 
  case CC_F(_, CC_F(CC_F(_, _, _), CC_E(_, _), CC_A(_, _, _)), CC_A(_, _, CC_D())) => 11 
  case CC_F(_, CC_F(CC_D(), CC_F(_, _, _), CC_A(_, _, _)), CC_A(_, _, CC_D())) => 12 
  case CC_F(_, CC_F(CC_E(_, _), CC_F(_, _, _), CC_A(_, _, _)), CC_A(_, _, CC_D())) => 13 
  case CC_F(_, CC_F(CC_F(_, _, _), CC_F(_, _, _), CC_A(_, _, _)), CC_A(_, _, CC_D())) => 14 
  case CC_F(_, CC_D(), CC_A(_, _, CC_E(_, _))) => 15 
  case CC_F(_, CC_E(CC_D(), _), CC_A(_, _, CC_E(_, _))) => 16 
  case CC_F(_, CC_E(CC_E(_, _), _), CC_A(_, _, CC_E(_, _))) => 17 
  case CC_F(_, CC_E(CC_F(_, _, _), _), CC_A(_, _, CC_E(_, _))) => 18 
  case CC_F(_, CC_F(CC_D(), CC_D(), CC_A(_, _, _)), CC_A(_, _, CC_E(_, _))) => 19 
  case CC_F(_, CC_F(CC_E(_, _), CC_D(), CC_A(_, _, _)), CC_A(_, _, CC_E(_, _))) => 20 
  case CC_F(_, CC_F(CC_F(_, _, _), CC_D(), CC_A(_, _, _)), CC_A(_, _, CC_E(_, _))) => 21 
  case CC_F(_, CC_F(CC_E(_, _), CC_E(_, _), CC_A(_, _, _)), CC_A(_, _, CC_E(_, _))) => 22 
  case CC_F(_, CC_F(CC_F(_, _, _), CC_E(_, _), CC_A(_, _, _)), CC_A(_, _, CC_E(_, _))) => 23 
  case CC_F(_, CC_F(CC_D(), CC_F(_, _, _), CC_A(_, _, _)), CC_A(_, _, CC_E(_, _))) => 24 
  case CC_F(_, CC_F(CC_E(_, _), CC_F(_, _, _), CC_A(_, _, _)), CC_A(_, _, CC_E(_, _))) => 25 
  case CC_F(_, CC_F(CC_F(_, _, _), CC_F(_, _, _), CC_A(_, _, _)), CC_A(_, _, CC_E(_, _))) => 26 
  case CC_F(_, CC_D(), CC_A(_, _, CC_F(_, _, _))) => 27 
  case CC_F(_, CC_E(CC_D(), _), CC_A(_, _, CC_F(_, _, _))) => 28 
  case CC_F(_, CC_E(CC_E(_, _), _), CC_A(_, _, CC_F(_, _, _))) => 29 
  case CC_F(_, CC_E(CC_F(_, _, _), _), CC_A(_, _, CC_F(_, _, _))) => 30 
  case CC_F(_, CC_F(CC_D(), CC_D(), CC_A(_, _, _)), CC_A(_, _, CC_F(_, _, _))) => 31 
  case CC_F(_, CC_F(CC_E(_, _), CC_D(), CC_A(_, _, _)), CC_A(_, _, CC_F(_, _, _))) => 32 
  case CC_F(_, CC_F(CC_F(_, _, _), CC_D(), CC_A(_, _, _)), CC_A(_, _, CC_F(_, _, _))) => 33 
  case CC_F(_, CC_F(CC_D(), CC_E(_, _), CC_A(_, _, _)), CC_A(_, _, CC_F(_, _, _))) => 34 
  case CC_F(_, CC_F(CC_E(_, _), CC_E(_, _), CC_A(_, _, _)), CC_A(_, _, CC_F(_, _, _))) => 35 
  case CC_F(_, CC_F(CC_F(_, _, _), CC_E(_, _), CC_A(_, _, _)), CC_A(_, _, CC_F(_, _, _))) => 36 
  case CC_F(_, CC_F(CC_D(), CC_F(_, _, _), CC_A(_, _, _)), CC_A(_, _, CC_F(_, _, _))) => 37 
  case CC_F(_, CC_F(CC_E(_, _), CC_F(_, _, _), CC_A(_, _, _)), CC_A(_, _, CC_F(_, _, _))) => 38 
  case CC_F(_, CC_F(CC_F(_, _, _), CC_F(_, _, _), CC_A(_, _, _)), CC_A(_, _, CC_F(_, _, _))) => 39 
}
}
// This is not matched: CC_F(_, CC_F(CC_D(), CC_E(_, _), CC_A(_, _, _)), CC_A(_, _, CC_E(_, _)))