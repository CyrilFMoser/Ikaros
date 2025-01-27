package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[((Char,Byte),Byte), T_A[(Int,Byte), Int]], b: T_A[Int, T_A[Byte, Char]]) extends T_A[T_A[T_A[(Int,Int), Boolean], (Int,(Boolean,Byte))], T_A[T_A[Boolean, Char], Boolean]]
case class CC_B(a: Byte) extends T_A[T_A[T_A[(Int,Int), Boolean], (Int,(Boolean,Byte))], T_A[T_A[Boolean, Char], Boolean]]
case class CC_C[C](a: T_A[T_A[CC_A, C], C], b: CC_A, c: T_A[C, C]) extends T_A[CC_A, C]

val v_a: T_A[T_A[T_A[(Int,Int), Boolean], (Int,(Boolean,Byte))], T_A[T_A[Boolean, Char], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}