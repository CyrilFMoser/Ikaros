package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Char, T_A[Char, (Char,Boolean)]]) extends T_A[T_A[(Boolean,Byte), T_A[Char, Byte]], T_A[T_A[Int, Int], T_A[Int, Boolean]]]
case class CC_B(a: Int) extends T_A[T_A[(Boolean,Byte), T_A[Char, Byte]], T_A[T_A[Int, Int], T_A[Int, Boolean]]]

val v_a: T_A[T_A[(Boolean,Byte), T_A[Char, Byte]], T_A[T_A[Int, Int], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}