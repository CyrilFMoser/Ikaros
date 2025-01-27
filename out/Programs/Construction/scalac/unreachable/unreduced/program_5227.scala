package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_A[D, Char]], b: T_A[D, T_A[D, Char]]) extends T_A[D, T_A[D, Char]]
case class CC_B[E](a: T_B[E]) extends T_A[E, T_A[E, Char]]
case class CC_C[G, F](a: T_B[G], b: (CC_A[Byte],T_A[Byte, Char])) extends T_A[G, F]
case class CC_D(a: CC_A[T_A[(Char,Boolean), Char]], b: Int) extends T_B[T_A[CC_A[Char], (Int,Int)]]
case class CC_E(a: T_A[T_A[CC_D, CC_D], T_A[T_A[CC_D, CC_D], Char]], b: CC_A[CC_B[CC_D]], c: (T_A[CC_D, CC_D],T_B[(Char,Byte)])) extends T_B[T_A[CC_A[Char], (Int,Int)]]
case class CC_F(a: CC_E, b: CC_D) extends T_B[T_A[CC_A[Char], (Int,Int)]]

val v_a: T_A[CC_F, T_A[CC_F, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_)) => 1 
  case CC_A(_, CC_C(_, (_,_))) => 2 
  case CC_B(_) => 3 
  case CC_C(_, _) => 4 
}
}