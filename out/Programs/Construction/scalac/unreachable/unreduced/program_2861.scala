package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: E) extends T_A[E, (T_A[Char, Boolean],T_A[Int, Char])]
case class CC_B() extends T_A[T_B[T_B[Char, Int], (Int,Char)], (T_A[Char, Boolean],T_A[Int, Char])]
case class CC_C[F, G](a: T_B[F, F], b: G, c: T_A[F, F]) extends T_B[F, G]
case class CC_D[H, I](a: T_B[I, CC_C[(Int,Int), H]], b: T_A[((Boolean,Boolean),Byte), I], c: T_A[H, I]) extends T_B[H, I]

val v_a: T_A[T_B[T_B[Char, Int], (Int,Char)], (T_A[Char, Boolean],T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_C(_, (_,_), _)) => 0 
  case CC_A(CC_C(CC_D(_, _, _), CC_C(_, _, _), _), CC_C(_, (_,_), _)) => 1 
  case CC_A(CC_C(CC_C(_, _, _), CC_D(_, _, _), _), CC_C(_, (_,_), _)) => 2 
  case CC_A(CC_C(CC_D(_, _, _), CC_D(_, _, _), _), CC_C(_, (_,_), _)) => 3 
  case CC_A(CC_D(_, _, _), CC_C(_, (_,_), _)) => 4 
  case CC_A(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_D(_, _, _)) => 5 
  case CC_A(CC_C(CC_D(_, _, _), CC_C(_, _, _), _), CC_D(_, _, _)) => 6 
  case CC_A(CC_C(CC_C(_, _, _), CC_D(_, _, _), _), CC_D(_, _, _)) => 7 
  case CC_A(CC_C(CC_D(_, _, _), CC_D(_, _, _), _), CC_D(_, _, _)) => 8 
  case CC_A(CC_D(_, _, _), CC_D(_, _, _)) => 9 
  case CC_B() => 10 
}
}