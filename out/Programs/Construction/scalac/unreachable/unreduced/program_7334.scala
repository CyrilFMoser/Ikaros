package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[(Int,Int)]], b: T_A[T_A[Char]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: (Byte,Char)) extends T_A[T_A[CC_A]]
case class CC_C[C](a: T_A[C], b: T_A[T_A[CC_A]], c: CC_B) extends T_B[C]
case class CC_D[D](a: T_B[D], b: T_A[T_A[CC_A]]) extends T_B[D]
case class CC_E(a: CC_D[Char], b: T_B[T_B[Boolean]]) extends T_B[T_A[T_A[CC_A]]]

val v_a: T_B[T_A[T_A[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_C(_, CC_B(_), CC_B(_)), CC_B((_,_))) => 1 
  case CC_D(CC_D(_, _), CC_B((_,_))) => 2 
  case CC_D(CC_E(CC_D(_, _), CC_C(_, _, _)), CC_B((_,_))) => 3 
  case CC_D(CC_E(CC_D(_, _), CC_D(_, _)), CC_B((_,_))) => 4 
  case CC_E(CC_D(_, _), CC_C(_, CC_B(_), CC_B(_))) => 5 
  case CC_E(CC_D(_, _), CC_D(CC_C(_, _, _), _)) => 6 
  case CC_E(CC_D(_, _), CC_D(CC_D(_, _), _)) => 7 
}
}