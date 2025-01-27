package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[Byte, (Boolean,Char)]
case class CC_B(a: T_A[CC_A, (Boolean,Boolean)], b: T_B[CC_A]) extends T_A[Byte, (Boolean,Char)]
case class CC_D[D]() extends T_B[D]
case class CC_F[F]() extends T_B[F]

val v_a: T_A[Byte, (Boolean,Char)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_F()) => 1 
}
}
// This is not matched: (CC_A Int
//      (CC_A Byte Char Char Boolean Boolean Boolean (T_A Boolean Boolean))
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Int
//           (CC_A Byte Char Char Boolean Boolean Boolean (T_A Boolean Boolean))))