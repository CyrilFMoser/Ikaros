package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Int,Char)]], b: T_A[T_A[Boolean]], c: (T_A[Char],T_A[Int])) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A, b: Char, c: Boolean) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(_, _, true) => 1 
  case CC_B(_, _, false) => 2 
}
}