package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[Char, Char], Char], b: T_A[T_A[Char, Int], CC_A[Int]]) extends T_A[T_A[((Boolean,Byte),CC_A[Byte]), ((Boolean,Byte),CC_A[Byte])], ((Boolean,Byte),CC_A[Byte])]
case class CC_C[D](a: T_A[D, Char]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[((Boolean,Byte),CC_A[Byte]), ((Boolean,Byte),CC_A[Byte])], ((Boolean,Byte),CC_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(CC_C(_), _) => 2 
  case CC_C(_) => 3 
}
}