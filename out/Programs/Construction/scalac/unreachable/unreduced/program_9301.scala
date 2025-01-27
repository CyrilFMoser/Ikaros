package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, Char], c: T_B[E, Int]) extends T_A[E, Char]
case class CC_B[F](a: T_B[F, F], b: T_A[F, Char], c: T_A[F, Char]) extends T_A[F, Char]
case class CC_C(a: T_A[CC_B[Byte], T_A[Int, Char]], b: T_B[T_A[Byte, Byte], ((Char,Byte),Char)]) extends T_A[Char, Int]
case class CC_D[H, G]() extends T_B[G, H]
case class CC_E(a: CC_A[CC_C]) extends T_B[T_A[T_B[CC_C, CC_C], T_A[Char, Int]], (CC_C,CC_D[CC_C, CC_C])]

val v_a: T_A[T_B[T_A[T_B[CC_C, CC_C], T_A[Char, Int]], (CC_C,CC_D[CC_C, CC_C])], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_D()) => 0 
  case CC_A(_, CC_B(_, _, _), CC_D()) => 1 
  case CC_B(CC_D(), CC_A(_, CC_A(_, _, _), _), CC_A(_, _, _)) => 2 
  case CC_B(CC_D(), CC_A(_, CC_B(_, _, _), _), CC_A(_, _, _)) => 3 
  case CC_B(CC_D(), CC_B(_, _, _), CC_A(_, _, _)) => 4 
  case CC_B(CC_D(), CC_A(_, CC_A(_, _, _), _), CC_B(CC_D(), _, CC_A(_, _, _))) => 5 
  case CC_B(CC_D(), CC_A(_, CC_B(_, _, _), _), CC_B(CC_D(), _, CC_A(_, _, _))) => 6 
  case CC_B(CC_D(), CC_B(_, _, _), CC_B(CC_D(), _, CC_A(_, _, _))) => 7 
  case CC_B(CC_D(), CC_A(_, CC_A(_, _, _), _), CC_B(CC_D(), _, CC_B(_, _, _))) => 8 
  case CC_B(CC_D(), CC_B(_, _, _), CC_B(CC_D(), _, CC_B(_, _, _))) => 9 
}
}
// This is not matched: CC_B(CC_D(), CC_A(_, CC_B(_, _, _), _), CC_B(CC_D(), _, CC_B(_, _, _)))