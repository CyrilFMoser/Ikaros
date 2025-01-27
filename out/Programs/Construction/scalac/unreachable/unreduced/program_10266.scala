package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Boolean], (Boolean,Boolean)], b: T_A[Int, T_A[Boolean, Byte]], c: Boolean) extends T_A[T_A[(Char,Int), Int], T_A[T_A[Int, Char], T_A[(Int,Byte), Int]]]
case class CC_B() extends T_A[T_A[(Char,Int), Int], T_A[T_A[Int, Char], T_A[(Int,Byte), Int]]]
case class CC_C(a: CC_B, b: CC_B, c: Byte) extends T_A[T_A[(Char,Int), Int], T_A[T_A[Int, Char], T_A[(Int,Byte), Int]]]

val v_a: T_A[T_A[(Char,Int), Int], T_A[T_A[Int, Char], T_A[(Int,Byte), Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}