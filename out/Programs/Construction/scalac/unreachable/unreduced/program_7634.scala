package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[T_A[Char, Char], T_A[Int, Char]]]
case class CC_B(a: CC_A[T_A[Char, Boolean]], b: T_A[T_A[Char, Int], CC_A[Char]]) extends T_A[T_A[T_A[Char, Boolean], T_A[(Int,Byte), Byte]], T_A[T_A[Char, Char], T_A[Int, Char]]]
case class CC_C[D](a: Byte) extends T_A[D, T_A[T_A[Char, Char], T_A[Int, Char]]]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[(Int,Byte), Byte]], T_A[T_A[Char, Char], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_C(0) => 2 
  case CC_C(_) => 3 
}
}