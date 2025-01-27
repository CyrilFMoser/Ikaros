package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[((Byte,(Boolean,Byte)),Byte)]
case class CC_B(a: T_A[T_A[Char]]) extends T_A[((Byte,(Boolean,Byte)),Byte)]
case class CC_C[C]() extends T_B[C]

val v_a: T_A[((Byte,(Boolean,Byte)),Byte)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}