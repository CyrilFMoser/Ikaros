package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Char], T_A[Char, Boolean]], b: (Char,(Int,Int))) extends T_A[Boolean, T_A[T_A[Char, (Int,Boolean)], T_A[Int, Boolean]]]
case class CC_B[C](a: Int) extends T_A[Boolean, T_A[T_A[Char, (Int,Boolean)], T_A[Int, Boolean]]]

val v_a: T_A[Boolean, T_A[T_A[Char, (Int,Boolean)], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}