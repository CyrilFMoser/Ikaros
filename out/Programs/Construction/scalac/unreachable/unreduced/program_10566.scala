package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[Char]]) extends T_A[(Char,(Byte,(Char,Int)))]
case class CC_B(a: CC_A, b: CC_A) extends T_A[(Char,(Byte,(Char,Int)))]
case class CC_C(a: Byte) extends T_A[(Char,(Byte,(Char,Int)))]

val v_a: T_A[(Char,(Byte,(Char,Int)))] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _), CC_A(_, _))