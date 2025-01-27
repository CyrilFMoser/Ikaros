package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_B[(Int,Boolean)]], c: ((Int,Char),T_B[Byte])) extends T_A[T_B[T_B[Int]]]
case class CC_B(a: CC_A, b: T_B[Int], c: Boolean) extends T_A[T_B[T_B[Int]]]
case class CC_C() extends T_A[T_B[T_B[Int]]]

val v_a: T_A[T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, (_,_)), _, _) => 1 
  case CC_C() => 2 
}
}