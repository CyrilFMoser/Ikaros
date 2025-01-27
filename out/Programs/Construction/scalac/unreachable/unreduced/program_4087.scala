package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Boolean], T_A[Char, (Int,Boolean)]], b: T_A[T_B[(Int,Byte)], T_A[Boolean, Byte]], c: T_A[(Boolean,Char), Boolean]) extends T_A[T_A[(Int,Char), T_B[Byte]], T_A[Char, T_A[Boolean, Int]]]
case class CC_B() extends T_B[CC_A]
case class CC_C[D](a: T_A[D, D]) extends T_B[D]
case class CC_D() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
  case CC_D() => 2 
}
}