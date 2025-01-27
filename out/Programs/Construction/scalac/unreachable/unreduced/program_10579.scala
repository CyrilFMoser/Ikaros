package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[(Char,Int), CC_A[Int]], b: T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]], c: T_A[Char, T_A[(Int,Byte), Boolean]]) extends T_A[T_A[T_A[T_A[Byte, Byte], Byte], T_A[T_A[Byte, Byte], Byte]], T_A[T_A[Byte, Byte], Byte]]
case class CC_C(a: CC_A[T_A[Char, (Boolean,Boolean)]]) extends T_A[T_A[T_A[T_A[Byte, Byte], Byte], T_A[T_A[Byte, Byte], Byte]], T_A[T_A[Byte, Byte], Byte]]

val v_a: T_A[T_A[T_A[T_A[Byte, Byte], Byte], T_A[T_A[Byte, Byte], Byte]], T_A[T_A[Byte, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}