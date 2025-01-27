package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (Byte,(Byte,Boolean)), b: T_B[T_A[Int], T_A[Char]]) extends T_A[T_B[T_B[Char, Char], Int]]
case class CC_B() extends T_A[T_B[T_B[Char, Char], Int]]
case class CC_C(a: T_B[CC_A, T_A[Int]], b: T_A[(CC_B,(Byte,Int))], c: T_B[T_B[(Byte,Byte), CC_A], Byte]) extends T_A[T_B[T_B[Char, Char], Int]]
case class CC_D[D](a: T_A[D]) extends T_B[CC_C, D]

val v_a: T_A[T_B[T_B[Char, Char], Int]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A((_,(_,_)), _)